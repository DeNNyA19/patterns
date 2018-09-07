package patterns.iterator.iterators;

import models.Booking;

public interface BookingIterator {

    boolean hasNext();

    Booking getNext();

    void remove();
}
