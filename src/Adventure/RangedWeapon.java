package Adventure;

public class RangedWeapon extends Weapon{
  int ammo;
  public RangedWeapon(String name, String description, boolean isEdible, boolean isEquipped, int ammo) {
    super(name, description, isEdible, isEquipped);
    this.ammo = ammo;
  }

  public String canUse(int ammo) {
    String howMuchAmmo;

    if(ammo > 30) {
      howMuchAmmo = "You have a lot of ammo";
      return howMuchAmmo;
    }
    if(ammo > 20) {
      howMuchAmmo = "You have a decent ammount of ammo";
      return  howMuchAmmo;
    }
    if(ammo > 10) {
      howMuchAmmo = "You are starting to run out out of ammo";
      return howMuchAmmo;
    }
    howMuchAmmo = "You have run out of ammo";
    return howMuchAmmo;
  }
}
