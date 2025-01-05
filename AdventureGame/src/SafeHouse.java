
public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");

	}
public boolean getLocation() {
	player.setHealth(player.getrHealth());
	System.out.println("İyileştiniz!");
	System.out.println("Şu an Güvenli Ev adlı yerdesiniz.");
	return true;
}
}
