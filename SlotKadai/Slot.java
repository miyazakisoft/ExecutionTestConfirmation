/*学生番号：g445313氏名：宮崎光*/
public abstract class Slot {
	protected int medal; // メダルの枚数
	protected double probBig; // ビッグボーナスの確率
	protected double probRegular; // レギュラーボーナスの確率

	// コンストラクタ
	protected Slot(int medal, double probBig, double probRegular) {
		this.medal = medal;
		this.probBig = probBig;
		this.probRegular = probRegular;
	}

	protected void setMedal(int medal) {
		this.medal = medal;
	}

	protected int getMedal() {
		return medal;
	}

	protected int play() throws SlotEmptyException{
		if (medal <= 2) {
			throw new SlotEmptyException("メダルが足りません");
		}

		medal -= 3; // 1プレイでメダルを3枚消費

		// ビッグボーナス抽選
		if (Math.random() <= probBig) {
			bigBonus();
			return medal;
		}

		// レギュラーボーナス抽選
		if (Math.random() <= probRegular) {
			regularBonus();
			return medal;
		}

		return medal;
	}

	protected void regularBonus() {
		System.out.println("* regular bonus *");
		medal += 100;
	}

	abstract protected void bigBonus();
}
