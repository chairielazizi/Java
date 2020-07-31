/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author 60193
 */
public class Maze {
    
    public static void main(String[] args){
                String[] input = { 

                "####################", 

                "#S#       #F   #   #", 

                "# ####### #### # # #", 

                "#         #  # ### #", 

                "##### ### #        #", 

                "#   # #   ####### ##", 

                "#   # # ### #   #  #", 

                "#   # # #   # # ## #", 

                "#     #   #   #    #", 

                "####################", 

        }; 
                
        char [][] maze=parseMaze(input); 
        print(maze);
        boolean [][] visited=new boolean[maze.length][maze[0].length];
        Stack<coordinates> yes=new Stack<>();
        
        int[] first=start(maze);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        coordinates mula=new coordinates(first[0],first[1]);
        yes.push(mula);
        visited[mula.getY()][mula.getX()]=true;
        int count=0;
          while(!yes.isEmpty())
          {
              //System.out.println(count);
              count++;
              
              coordinates curr=yes.peek();
              int y=curr.getY(),x=curr.getX();
              
              if(maze[y][x]=='F')
              {
                 // System.out.println("c");
                  break;
              }
              if(maze[y-1][x]!='#'&&!visited[y-1][x])
                  y--;
              else if(maze[y+1][x]!='#'&&!visited[y+1][x])
                  y++;
              else if(maze[y][x+1]!='#'&&!visited[y][x+1])
                  x++;
              else if(maze[y][x-1]!='#'&&!visited[y][x-1])
                  x--;
              
              if(x!=curr.getX()||y!=curr.getY())
              {
              //    System.out.println("b");
                  visited[y][x]=true;
                  coordinates temp=new coordinates(y,x);
                  yes.push(temp);
              }
              else{
               //   System.out.println("a");
                   yes.pop();
              }
                 
          }
          if(yes.isEmpty())
              System.out.println("No solutions");
          else
          {
              yes.pop();
              int[] curr=new int[2];
              
              while(yes.getSize()>1)
              {
               coordinates now=yes.pop();
               curr[0]=now.getY();
               curr[1]=now.getX();
               maze[curr[0]][curr[1]]='.';
              }
          }
          
        
         print(maze);

            
        
    }
    private static void print(char[][] s)
    {
        for(int i=0;i<s.length;i++)
        { for(int j=0;j<s[0].length;j++)
            {
                System.out.print(s[i][j]);
            }
            System.out.println("");
        }
    }
    
    private static char[][] parseMaze(String[] s)
    {
        char[][] maze=new char[s.length][s[0].length()];
        
        for(int i=0;i<s.length;i++)
            for(int j=0;j<s[0].length();j++)
            {
                maze[i][j]=s[i].charAt(j);
            }
        return maze;
    }
    private static int[] start(char[][] s)
    {
        int[] mula=new int[2];
        for(int i=0;i<s.length;i++)
            for(int j=0;j<s[0].length;j++)
            {
                if(s[i][j]=='S')
                {
                    mula[0]=i;
                    mula[1]=j;
                }
                    
            }
        return mula;
    }
    
}
