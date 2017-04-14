/*学生番号：g445313氏名：宮崎光*/
public class PlaySlot {
	public static void test(Slot slot, int medal, int times) {
		slot.setMedal(medal);
		try {
			for (int i = 0; i < times; i++) {
				if (slot.play() < 3) {
					System.out.println(i + "回目でメダルが無くなりました");
					return;
				}
			}
		} catch (SlotEmptyException e) {
			System.err.println(e.getMessage());

			System.err.println("以下、スタックトレース");
			e.printStackTrace();// スタックトレースの表示
		}
	}

	public static void main(String[] args) {
		Slot slotA = new SlotAType();
		Slot slotB = new SlotBType();
		Slot slotC = new SlotCType();

		System.out.println("playing A Type");
		test(slotA, 1000, 4000);
		System.out.println("slotA: " + slotA.getMedal());

		System.out.println("playing B Type");
		test(slotB, 1000, 4000);
		System.out.println("slotB: " + slotB.getMedal());

		System.out.println("playing C Type");
		test(slotC, 1000, 4000);
		System.out.println("slotC: " + slotC.getMedal());

		
		System.out.println("");
		System.out.println("以下、例外テスト");
		System.out.println("playing C Type");
		test(slotC, 0, 4000);
		System.out.println("slotC: " + slotC.getMedal());
	}
}
