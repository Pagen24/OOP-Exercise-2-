public class Item_1 extends Shopee
{
  String Item_info;
	public Item_1(String product_name, int price, String Item_info) {
		super(product_name, price);
		this.Item_info=Item_info;
	}

	@Override
	public String item_info() {
		return "This is your First Item Information.";
	}

	public String getItemInfo() {
		return Item_info;
	}
	public void setItemInfo(String Item_info) {
		this.Item_info=Item_info;
	}
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
