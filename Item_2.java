public class Item_2 extends Shopee
{
  String Item_info;
	public Item_2(String product_name, int price, String Item_info) {
		super(product_name,price);
		this.Item_info=Item_info;
	}
	@Override
	public String item_info() {
		return "\nThis is your Second Item information.";
	}

	public String getItemInfo() {
		return Item_info;
	}

	public void setItemInfo(String Item_info) {
		this.Item_info=Item_info;
	}
}
