
public class SillySwordSetup 
{
	private boolean fireGem=false, lesserFireGem=false, greaterFireGem=false, lightingGem=false, greaterLightningGem=false,lesserLightningGem=false;
	private int swordAttackPower;
	
	public SillySwordSetup(int swordAttackPower) 
	{
		this.swordAttackPower = swordAttackPower;
	}
	
	public void attack(GameCharacter target)
	{
		target.takeWeaponDamage(swordAttackPower);
		if(fireGem)
		{
			target.takeFireDamage(10);
		}
		if (lesserFireGem)
		{
			target.takeFireDamage(5);
		}
		if (greaterFireGem)
		{
			target.takeFireDamage(20);
		}
		if(lightingGem)
		{
			target.takeLightningDamage(10);
		}
		if(lesserLightningGem)
		{
			target.takeLightningDamage(5);
		}
		if(greaterLightningGem)
		{
			target.takeLightningDamage(20);
		}
	}
	
	
	public boolean isFireGem() {
		return fireGem;
	}

	public void setFireGem(boolean fireGem) {
		this.fireGem = fireGem;
	}

	public boolean isLesserFireGem() {
		return lesserFireGem;
	}

	public void setLesserFireGem(boolean lesserFireGem) {
		this.lesserFireGem = lesserFireGem;
	}

	public boolean isGreaterFireGem() {
		return greaterFireGem;
	}

	public void setGreaterFireGem(boolean greaterFireGem) {
		this.greaterFireGem = greaterFireGem;
	}

	public boolean isLightingGem() {
		return lightingGem;
	}

	public void setLightingGem(boolean lightingGem) {
		this.lightingGem = lightingGem;
	}

	public boolean isGreaterLightningGem() {
		return greaterLightningGem;
	}

	public void setGreaterLightningGem(boolean greaterLightningGem) {
		this.greaterLightningGem = greaterLightningGem;
	}

	public boolean isLesserLightningGem() {
		return lesserLightningGem;
	}

	public void setLesserLightningGem(boolean lesserLightningGem) {
		this.lesserLightningGem = lesserLightningGem;
	}
	
	
}
