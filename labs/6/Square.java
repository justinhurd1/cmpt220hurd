public class Square{
	private double width;

	public Square(){
		width=1;
	}

	public Square(double width){
		this.width=width;
	}

	public double getWidth(){
		return width;
	}

	public double getArea(){
		return width*width;
	}
	
	public double getPerimeter(){
		return 2.0*(width+width);
	}

}