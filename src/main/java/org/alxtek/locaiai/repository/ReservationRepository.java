package org.alxtek.locaiai.repository;

import org.alxtek.locaiai.entities.Reservation;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReservationRepository extends PagingAndSortingRepository<Reservation, Long> {
}
