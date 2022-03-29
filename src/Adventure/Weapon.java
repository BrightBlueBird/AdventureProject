package Adventure;

public class Weapon extends Item {
  private boolean isEquipped;
  private int ammo;
  Weapon(String name, String description, boolean isEdible, boolean isEquipped){
    super(name, description, isEdible);
    this.isEquipped = isEquipped;
  }

  public boolean canUse() {
    //Always returns true tror jeg.
    return true;

  }
  public int getAmmo() {
    return ammo;
  }
}
