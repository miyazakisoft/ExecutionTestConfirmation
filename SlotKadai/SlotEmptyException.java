/*学生番号：g445313氏名：宮崎光*/
@SuppressWarnings("serial")//serialVersionUIDは「定義しない」
public class SlotEmptyException extends Exception {

	SlotEmptyException(String Error_Message) {
		super(Error_Message);
	}

	SlotEmptyException() {
		this("");
	}

}
