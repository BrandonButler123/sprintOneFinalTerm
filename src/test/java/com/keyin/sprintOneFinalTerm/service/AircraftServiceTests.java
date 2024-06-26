package com.keyin.sprintOneFinalTerm.service;

import com.keyin.sprintOneFinalTerm.model.Aircraft;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class AircraftServiceTests {

    @Mock
    private AircraftService aircraftService;

    @BeforeEach
    public void setup() {
        // Optional: Initialize test data or perform setup here
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    public void testAddAircraft() {
        Aircraft aircraft = new Aircraft();
        aircraft.setType("Boeing 737");
        aircraft.setAirlineName("Air Canada");
        aircraft.setPassengerCapacity(160);

        Mockito.when(aircraftService.addAircraft(Mockito.any(Aircraft.class))).thenReturn(aircraft);

        Aircraft addedAircraft = aircraftService.addAircraft(aircraft);

        Assertions.assertNotNull(addedAircraft);
        Assertions.assertEquals("Boeing 737", addedAircraft.getType());
        Assertions.assertEquals("Air Canada", addedAircraft.getAirlineName());
    }

    @Test
    public void testGetAllAircraft() {
        Aircraft aircraft1 = new Aircraft(1, "Boeing 737", "Air Canada", 160, null, null, null);
        Aircraft aircraft2 = new Aircraft(2, "Airbus A320", "WestJet", 180, null, null, null);
        List<Aircraft> aircraftList = Arrays.asList(aircraft1, aircraft2);

        Mockito.when(aircraftService.getAllAircraft()).thenReturn(aircraftList);

        List<Aircraft> returnedAircraftList = aircraftService.getAllAircraft();

        Assertions.assertNotNull(returnedAircraftList);
        Assertions.assertEquals(2, returnedAircraftList.size()); // Additional assertion for clarity
        Assertions.assertTrue(!returnedAircraftList.isEmpty());
    }
}
