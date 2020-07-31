/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl5q6;

/**
 *
 * @author chairiel
 */
public class DSL5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] map = {"#################",
                        "#S#       #F    #",
                        "# ####### ##### #",
                        "#           # # #",
                        "##### ### # #   #",
                        "#   # #   #     #",
                        "#   # # #########",
                        "#   # # #       #",
                        "#               #",
                        "#################"
        };
        for(String m:map)
            System.out.println(m);
        
        char[][] peta = charMap(map);
        boolean[][] visited = new boolean[peta.length][peta[0].length];
        Stack<Position> point = new Stack<>();
        
        int[] pointstart = startingPoint(peta);
        Position start = new Position(pointstart[0],pointstart[1]);
        point.push(start);
        visited[start.getX()][start.getY()]=true;
        
        int count=0;
        while(!point.isEmpty()){
            count++;
            Position current = point.peek();
            int x= current.getX();
            int y= current.getY();
            
            if(peta[x][y]=='F')
                break;
            
            if(peta[x-1][y]!='#' && !visited[x-1][y]){
                x--;
            }
            else if(peta[x+1][y]!='#' && !visited[x+1][y]){
                x++;
            }
            else if(peta[x][y-1]!='#' && !visited[x][y-1]){
                y--;
            }
            else if(peta[x][y+1]!='#' && !visited[x][y+1]){
                y++;
            }
            
            if(x != current.getX() && y != current.getY()){
                visited[x][y]=true;
                Position temp = new Position(x,y);
                point.push(temp);
                System.out.println("a");
            }
            else{
                System.out.println("b");
                point.pop();
            }
            
        }
        if(point.isEmpty())
            System.out.println("No solutions");
        else{
            point.pop();
            int[] current = new int[2];
            
            while(point.getSize()>1){
                Position curr = point.pop();
                current[0]= curr.getX();
                current[1]= curr.getY();
                peta[current[0]][current[1]]='.';
            }
        }
        
        System.out.println("\nThe solution is");
        for(int i=0;i<peta.length;i++){
            for(int j=0;j<peta[0].length;j++){
                System.out.print(peta[i][j]);
            }
            System.out.println();
        }
        
    }
    
    public static char[][] charMap(String[] input){
        char[][] map = new char[input.length][input[0].length()];
        
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[0].length();j++){
                map[i][j] = input[i].charAt(j);
            }
        }
        return map;
    }
    
    public static int[] startingPoint(char[][] map){
        int[] start = new int[2];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(map[i][j]=='S'){
                    start[0]=i;
                    start[1]=j;
                }
            }
        }
        return start;
    }
}

class Position{
    private int x;
    private int y;
    private boolean visited;
    
    public Position(){
        x=0;
        y=0;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}