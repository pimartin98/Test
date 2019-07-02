package animal;

import java.util.Objects;

public abstract class NamedAnimal implements Animal {

	private final String type;

	private final String name;

	public NamedAnimal(String type, String name) {
		this.type = Objects.requireNonNull(type, "type");
		this.name = Objects.requireNonNull(name, "name");
	}

	@Override
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return type + '[' + name + ']';
	}

}
