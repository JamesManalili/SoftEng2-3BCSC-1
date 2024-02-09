package ActStrategyPattern;

public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;
    private String character;
    private Knight knight;

    public Character(String character, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.character = character;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }
    
    
}
