public class HealthBar {
    static class Character { private int health; private final int maxHealth; Character(int maxHealth) { this.maxHealth = maxHealth; health = maxHealth; } void takeDamage(int amount) { health = Math.max(0, health - amount); } void heal(int amount) { health = Math.min(maxHealth, health + amount); } int getHealth() { return health; } }
    public static void main(String[] args) { Character c = new Character(100); c.takeDamage(30); System.out.println("Health: " + c.getHealth()); c.heal(50); System.out.println("Health: " + c.getHealth()); c.takeDamage(150); System.out.println("Health: " + c.getHealth()); }
}
