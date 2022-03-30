package Adventure;

public class Weapon extends Item {
  private boolean isEquipped;
  private int ammo;
  Weapon(String name, String description, boolean isEdible, boolean isEquipped){
    super(name, description, isEdible);
    this.isEquipped = isEquipped;
  }

 public String canUse() {
    return null;
  }

  public int getAmmo() {
    return ammo;
  }

  public void setIsEquipped(boolean isEquipped) {
    this.isEquipped = isEquipped;
  }

  public boolean getIsEquipped() {
    return isEquipped;
  }
}
