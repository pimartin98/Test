package animal;

import java.util.Objects;

public abstract class NamedAnimal implements Animal, Comparable<NamedAnimal> {

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
	public int compareTo(NamedAnimal o) {
		return name.compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NamedAnimal other = (NamedAnimal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	abstract void monMaitreMeLave();

	@Override
	public String toString() {
		return type + '[' + name + ']';
	}

}
