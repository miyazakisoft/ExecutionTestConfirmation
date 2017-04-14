/*学生番号：g445313氏名：宮崎光*/
public class SlotAType extends Slot {

	// コンストラクタ
	protected SlotAType() {
		//super(メダルの枚数,ビッグ,レギュラー)
		super(0, 1.0 / 150.0, 1.0 / 200.0);
	}

	@Override
	protected void bigBonus() {
		System.out.println("*** big bonus ***");
		for (int i = 0; i < 3; i++) {
			medal += Math.random() * 50;
			regularBonus();
		}
	}

}
