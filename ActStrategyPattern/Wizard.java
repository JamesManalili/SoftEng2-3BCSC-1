package ActStrategyPattern;

public class Wizard implements DefenseStrategy, AttackStrategy{

    @Override
    public String createMagic() {
        String output = new String();
        output += "Creating a magic barrier for defense!";
        return output;
    }

    @Override
    public String dodge() {
        return null;
    }

    @Override
    public String shield() {
        return null;
    }

    @Override
    public String castSpell() {
        String output = new String();
        output += "Wizard casts a spell!";
         return output;
    }

    @Override
    public String shootArrow() {
        return null;
    }

    @Override
    public String swingSword() {
        // TODO Auto-generated method stub
        return null;
    }

  
 
}
