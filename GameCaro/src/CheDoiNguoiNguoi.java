import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class CheDoiNguoiNguoi {
	private GuiNguoiNguoi giaodien;
	private ArrayList<ArrayList<Object>> mangOCo;
	
	public CheDoiNguoiNguoi(GuiNguoiNguoi nguoi) {
		//mangOCo = giaodien.dsOCo;
		mangOCo = nguoi.dsOCo;
		giaodien = nguoi;
	}
	
	public GuiNguoiNguoi getGiaodien() {
		return giaodien;
	}

	public void setGiaodien(GuiNguoiNguoi giaodien) {
		this.giaodien = giaodien;
	}

	public CheDoiNguoiNguoi() {
		giaodien = new GuiNguoiNguoi("caro");
		mangOCo = giaodien.dsOCo;
	}
	
}
