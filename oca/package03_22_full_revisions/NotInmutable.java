package package03_22_full_revisions;

class NotInmutable {
	private StringBuilder sb;

	public NotInmutable(StringBuilder sb) {
		this.sb = sb;
	}

	public NotInmutable(StringBuilder sb, boolean isInmutable) {
		// Protected constructor: defensive copy
		if (isInmutable) {
			this.sb = new StringBuilder(sb);
		}
	}

	public StringBuilder getSb() {
		return sb;
	}

	public StringBuilder getProtectedSb() {
		return new StringBuilder(sb);
	}

	public static void main(String... args) {
		StringBuilder original = new StringBuilder("My initial string");
		NotInmutable a = new NotInmutable(original);
		StringBuilder reference = a.getSb();
		System.out.println(reference);
		reference.append("=========");
		System.out.println(a.getSb()); // The sb from NotInmutable has been
										// updated

		// Second try, with protected constructor
		original = new StringBuilder("My initial string");
		NotInmutable b = new NotInmutable(original, true);
		reference = b.getProtectedSb();
		System.out.println(reference);
		reference.append("=========");
		System.out.println(b.getProtectedSb()); // No change => Getter is
												// protected
		original.append("++++");
		System.out.println(b.getProtectedSb()); // No change => constructor is
												// protected

	}
}