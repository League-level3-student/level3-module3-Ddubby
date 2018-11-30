package Checkpoint;

public class Animation2D extends Animation implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing");
	}
	
	public static void main(String[] args) {
		Animation2D animation = new Animation2D();
		animation.draw();
		System.out.println(animation.getFramerate());
	}
}
