package builder.simple;

/**
 * 链式调用
 * Create by lixinglin on 2018/7/29.
 * At 11:53
 */
public class Square {
	private String color;
	private int height;
	private int width;
	
	public String getColor() {
		return color;
	}
	public Square(Builder builder) {
		this.color = builder.color;
		this.height = builder.height;
		this.width = builder.width;
	}
	
	static final class Builder {
		private String color;
		private int height;
		private int width;
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}
		public Builder setHeight(int height) {
			this.height = height;
			return this;
		}
		public Builder setWidth(int width) {
			this.width = width;
			return this;
		}
		public Square build() {
			return new Square(this);
		}
	}

}
