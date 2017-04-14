/*学生番号：g445313氏名：宮崎光*/
public class SlotCType extends Slot {
	// 定数
	private static final double PROB_RENCHAN = 9.0 / 10.0; // 連チャン確率

	// コンストラクタ
	protected SlotCType() {
		// super(メダルの枚数,ビッグ,レギュラー)
		super(0, 1.0 / 300.0, 0.0);
	}

	@Override
	protected void bigBonus() {
		System.out.println("*** big bonus ***");

		medal += Math.random() * 50;
		regularBonus();

		if (Math.random() < PROB_RENCHAN) {
			System.out.println("連チャン");
			bigBonus();
		}
	}
}