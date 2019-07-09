package animal;

public interface Animal {

	String getType();

	default String getBigType() {
		return getType().toUpperCase();
	}

}
