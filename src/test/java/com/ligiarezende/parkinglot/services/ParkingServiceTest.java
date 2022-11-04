package com.ligiarezende.parkinglot.services;

import com.ligiarezende.parkinglot.Factory;
import com.ligiarezende.parkinglot.dto.ParkingDTO;
import com.ligiarezende.parkinglot.repositries.ParkingRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ParkingServiceTest {

    @InjectMocks
    private ParkingService parkingService;

    @Mock
    private ParkingRepository parkingRepository;

    @Test
    public void findByIdShouldReturnProductDtoWhenValidId() {
        ParkingDTO parkingDTO = Factory.createParkingDTO();

        ParkingDTO result = parkingService.findById(1L);
        when(parkingRepository.findById(any())).thenReturn();
        Assertions.assertNotNull(result);
    }



//    @Test
//    public void createParking() {
//
//        ParkingDTO parkingDTO = Factory.createParkingDTO();
//
//        when(parkingRepository.save(any())).thenReturn(parkingDTO);
//
//        ParkingDTO notNull = parkingService.create(parkingDTO);
//        Assertions.assertNotNull(notNull);
//    }
//
//    @Test
//    public void shouldUpdatePaymentWhenReceivesValidParams() {
//
//        final ParkingDTO parkingDTO = Factory.createParkingDTO();
//
//        ParkingDTO notNull = parkingService.updatePayment(1L,parkingDTO);
//        Assertions.assertNotNull(notNull);
//    }
}
