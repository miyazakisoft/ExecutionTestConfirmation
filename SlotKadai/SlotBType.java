/*学生番号：g445313氏名：宮崎光*/
public class SlotBType extends Slot {
	// 定数
	private static final double PROB_RENCHAN = 3.0 / 5.0; // 連チャン確率

	// コンストラクタ
	protected SlotBType() {
		//super(メダルの枚数,ビッグ,レギュラー)
		super(0, 1.0 / 200.0, 1.0 / 350.0);
	}

	@Override
	protected void bigBonus() {
		System.out.println("*** big bonus ***");
		for (int i = 0; i < 2; i++) {
			medal += Math.random() * 50;
			regularBonus();
		}
		if (Math.random() < PROB_RENCHAN) {
			System.out.println("連チャン");
			bigBonus();
		}
	}
}
