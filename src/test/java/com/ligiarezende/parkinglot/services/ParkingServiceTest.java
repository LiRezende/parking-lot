package com.ligiarezende.parkinglot.services;

import com.ligiarezende.parkinglot.Factory;
import com.ligiarezende.parkinglot.dto.ParkingDTO;
import com.ligiarezende.parkinglot.entities.Parking;
import com.ligiarezende.parkinglot.repositries.ParkingRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ParkingServiceTest {

    @InjectMocks
    private ParkingService parkingService;

    @Mock
    private ParkingRepository parkingRepository;

    Parking parking;

    ParkingDTO parkingDTO;

    @BeforeEach
    void setUp() throws Exception {
        parking = Factory.createParking();
        parkingDTO = Factory.createParkingDTO();
    }

    @Test
    public void findByIdShouldReturnPlateWhenValidId() {
        when(parkingRepository.findById(any())).thenReturn(Optional.of(parking));

        ParkingDTO result = parkingService.findById(1L);

        Assertions.assertNotNull(result);
    }

    @Test
    public void shouldCreateParkingWhenReceivesValidParams() {
        when(parkingRepository.save(any())).thenReturn(parking);

        ParkingDTO notNull = parkingService.create(parkingDTO);
        Assertions.assertNotNull(notNull);
    }

    @Test
    public void shouldUpdatePaymentWhenReceivesValidParams() {
        when(parkingRepository.getReferenceById(any())).thenReturn(parking);

        when(parkingRepository.save(any())).thenReturn(parking);

        ParkingDTO notNull = parkingService.updatePayment(1L,parkingDTO);

        Assertions.assertNotNull(notNull);
    }
}
