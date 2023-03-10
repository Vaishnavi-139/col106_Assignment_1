
public class ParenthesisMatching {
    public Character compliment(Character o){
        if (o == ')'){
            return ('(');
        }
        else if(o=='}'){
            return ('{');
        }
        else if(o==']'){
            return ('[');
        }
        else{
            return (0);
        }
    }

    public Boolean match_parenthesis(String s){
        DemoStack M = new DemoStack();
        for(var m = 0; m< s.length(); m++){
                if (M.is_empty()){
                    M.push(s.charAt(m));
                }
                else if (M.top()== compliment(s.charAt(m))){
                    Character d = M.pop();
                }
                else{
                    M.push(s.charAt(m));
       }}
       if(M.is_empty()){
        return true;
       }
       else{
        return false;
       }
    }
}
