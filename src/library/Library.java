package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	public ArrayList<Media> media = new ArrayList<>();

	public boolean addItem(Media m) {
		return this.media.add(m);
	}

	public boolean removeItem(Media m) {
		return this.media.remove(m);
	}

	public boolean collect(int id) {
		for (Media m : this.media) {
			if (id == m.getId()) {
				return this.media.remove(m);
			}
		}
		return false;

	}

	public boolean collect(int... ids) {
		List<Media> toRemove = new ArrayList<>();
		for (Media m : this.media) {
			for (int id : ids) {
				if (id == m.getId()) {
					toRemove.add(m);

				}
			}
		}
		return this.media.removeAll(toRemove);
	}

	@Override
	public String toString() {
		return "Home Library" + "" + media;
	}
}
