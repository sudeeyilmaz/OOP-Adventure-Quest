import java.util.Scanner;
public class Game {
Player player;
Location location;
Scanner scan = new Scanner(System.in);
public void login() {
	
	System.out.println("Macera Oyununa Hoş Geldiniz!");
	System.out.println("Oyuna başlamadan önce adınızı giriniz: ");
	String playername = scan.nextLine();
	player = new Player(playername);
	player.selectCha();
	start();
	
}
public void start() {
	while(true) {
	System.out.println();
	System.out.println("--------------------------------");
	System.out.println("Gitmek istediğiniz yeri seçin: " );
	System.out.println("1-Güvenli Ev: (düşman yok)");
	System.out.println("2-Mağara (zombiler var!)");
	System.out.println("3-Orman (vampirler var!)");
	System.out.println("4-Nehir (ayılar var!)");
	System.out.println("5-Dükkan (malzeme alabilirsiniz..)");
	System.out.print("Seçiminiz: ");
	int selLoc = scan.nextInt();
	while(selLoc<1 || selLoc>5) {
		System.out.println("Lütfen geçerli bir yer giriniz: ");
		selLoc = scan.nextInt();
	}
	switch(selLoc) {
	case 1: 
		location = new SafeHouse(player);
		break;
	case 2: 
		location = new Cave(player);
		break;
	case 3 :
		location = new Forest(player);
		break;
	case 4:
		location = new River(player);
        break;

	case 5:
		location = new ToolStore(player);
		break;
    default:
			location = new SafeHouse(player);
			break;
	}
	if(location.getClass().getName().equals("SafeHouse")) {
		if(player.getInv().isFirewood() && player.getInv().isFood()&& player.getInv().isWater()) {
			System.out.println("Tebrikler Oyunu Kazandınız! :)");
			break;
		}
		
	}
	if(!location.getLocation()) {
		System.out.println("Oyun bitti!");
		break;
	}
	location.getLocation();
}
}}
