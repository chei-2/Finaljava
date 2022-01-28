package testing;
	class Bus{
		
	}
public class Methodoverload {
	int vehicle(int v,int u) {
		return v+u;
		}
		float vehicle(float v,float u) {
		return v-u;
		}
		float vehicle(float v,int u,int c) {
		return (v/u)+c;
		}
		float vehicle(int v,int u,int c) {
		return v%u;
		}
	public static void main(String[] args) {
		
	}
}
