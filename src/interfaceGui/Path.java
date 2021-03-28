package interfaceGui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Path{
	
	
	/*attributes*/
	private int w = 30;
	private int h = 30;
	private int offset = 100;
	private List<interfaceGui.BoardSquare> path;
	
	/*Constructor*/
	
	public Path(){
		this.path = new ArrayList<interfaceGui.BoardSquare>();
		this.Initializer();
	}
	
	/*Methods*/
	
	public void Initializer() {
		for(int i=0; i<6; i++) {
			this.path.add(new interfaceGui.BoardSquare(offset+w*i, offset+6*h, i+1));
			this.path.add(new interfaceGui.BoardSquare(offset+w*(9+i), offset+6*h, i+20));
			this.path.add(new interfaceGui.BoardSquare(offset+w*i, offset+8*h, 51-i));
			this.path.add(new interfaceGui.BoardSquare(offset+w*(9+i), offset+8*h, 32-i));
		}
		
		for(int i=0; i<6; i++) {
			this.path.add(new interfaceGui.BoardSquare(offset+w*6, offset+h*i, 12-i));
			this.path.add(new interfaceGui.BoardSquare(offset+w*6, offset+h*(9+i), 45-i));
			this.path.add(new interfaceGui.BoardSquare(offset+w*8, offset+h*i, 14+i));
			this.path.add(new interfaceGui.BoardSquare(offset+w*8, offset+h*(9+i), 33+i));
		}
		
		this.path.add(new interfaceGui.BoardSquare(offset, offset+7*h, 52));
		this.path.add(new interfaceGui.BoardSquare(offset+7*w, offset, 13));
		this.path.add(new interfaceGui.BoardSquare(offset+14*w, offset+7*h, 26));
		this.path.add(new interfaceGui.BoardSquare(offset+7*w, offset+14*h, 39));
		
		Collections.sort(this.path, new Comparator<interfaceGui.BoardSquare>() {
		    @Override
		    public int compare(interfaceGui.BoardSquare b1, interfaceGui.BoardSquare b2) {
		        return b1.getiD() - b2.getiD();
		    }
		});
	}	
	
	

}











