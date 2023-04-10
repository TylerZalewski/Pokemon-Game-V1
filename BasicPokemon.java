public class BasicPokemon
{
    public String name;
    public int totalHealth, currentHealth;
    public int attack;
    public int defense;

    public BasicPokemon(String n, int a, int d)
    {
        name = n;
        totalHealth = 100;
        currentHealth = 100;
        attack = a;
        defense = d;
    }
}
