import java.util.HashMap;

public abstract class Sword<totalGemDamage> implements Weapon {

    private int swordAttackPower;
    private static HashMap<Gem,Integer> LightningGems;
    private static HashMap<Gem,Integer> FireGems;
    private int totalGemDamage = 0 ;
    private int totalFireGemDamage = 0;
    private int totalLightningGemDamage = 0;

    public void SwordSetup(int swordAttackPower)
    {
        this.swordAttackPower = swordAttackPower;
        this.totalFireGemDamage = 0;
        this.totalGemDamage = 0;

    }

    public void attack(GameCharacter target){
        target.takeWeaponDamage(swordAttackPower);
        target.takeFireDamage(this.totalFireGemDamage);
        target.takeLightningDamage(this.totalLightningGemDamage);
    }


    public void getTotalDamage(){

        for (Gem gem: LightningGems.keySet()){
            this.totalLightningGemDamage += LightningGems.get(gem)* gem.getDamage();
        }
        for (Gem gem: FireGems.keySet()){
            this.totalFireGemDamage += FireGems.get(gem)* gem.getDamage();
        }

    }


}
