package Aggregration;

public class Sim {
String type;
String provider;
public Sim(String type, String provider) {
	this.type = type;
	this.provider = provider;
}
@Override
public String toString() {
	return "Sim [type=" + type + ", provider=" + provider + "]";
}
}
