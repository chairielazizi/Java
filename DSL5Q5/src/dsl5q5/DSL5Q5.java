/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl5q5;

/**
 *
 * @author chairiel
 */
public class DSL5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String xml = "";
        xml += "<H1>";
        xml += "<test>Test</test>";
        xml += "<data>The data is used in this test</data>";
        xml += "</H1>";
        
        String result = checkxml(xml);
        System.out.println(result);
    }
    
    public static String checkxml(String input){
        Stack<String> tagstack = new Stack<>();
        String tag = "";
        boolean tagcheck = false;
        while(input.length() > 0){
            if(input.charAt(0)=='\n' || input.charAt(0)=='\t'){
                input = input.substring(1);
                continue;
            }
            if(tagcheck){
                if(input.charAt(0)=='>'){
                    tagcheck = false;
                    if(tag.length()<=0){
                        return "The tag is empty";
                    }
                    if(tag.charAt(0)=='/'){
                        tag = tag.substring(1);
                        if(tagstack.getSize() <= 0){
                            return "No begin element for </"+tag+">";
                        }
                        if(tagstack.peek().equals(tag)){
                            return "Begin element <"+tagstack.peek()+"> invalid ending element </"+tag+">";
                        }
                        tagstack.pop();
                    }
                    else{
                        tagstack.push(tag);
                    }
                    tag="";
                }
                else{
                    tag += input.charAt(0);
                }
            }
            else{
                if(input.charAt(0)=='<'){
                    tagcheck =true;
                }
            }
            input = input.substring(1);
        }
        if(tagstack.getSize()>0){
            return "Begin element<"+tagstack.peek()+">has no ending element";
        }
        return "valid xml";
    }
}
