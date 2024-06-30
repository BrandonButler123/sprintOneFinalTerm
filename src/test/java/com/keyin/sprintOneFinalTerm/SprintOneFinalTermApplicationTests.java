package com.keyin.sprintOneFinalTerm;

import java.beans.Transient;
import com.keyin.domain.Airport;
import com.keyin.http.cli.HTTPRestCLIApplication;
import com.keyin.http.client.RESTClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class SprintOneFinalTermApplicationTests {
	@Mock
    private AircraftController aircraftController;

    @Mock
    private AirportController airportController;

    @Mock
    private CityController cityController;

    @Mock
    private PassengerController passengerController;

    @InjectMocks
    private AircraftService aircraftService;

    @InjectMocks
    private AirportService airportService;

    @InjectMocks
    private CityService cityService;

    @InjectMocks
    private PassengerService passengerService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

	@Test
    public void testGetAirport() {
        Airport airport = new Airport(1, "St John's Airport");
        when(airportRepository.findById(1)).thenReturn(Optional.of(airport));

        Airport result = airportService.getAirportById(1);
        assertNotNull(result);
        assertEquals("St John's Airport", result.getName());
    }

	@Test
    public void testGetCity() {
        City city = new City(1, "St John's");
        when(cityRepository.findById(1)).thenReturn(Optional.of(city));

        City result = cityService.getCityById(1);
        assertNotNull(result);
        assertEquals("St John's", result.getName());
    }

	@Test
    public void testGetPassenger() {
        Passenger passenger = new Passenger(1, "John Doe");
        when(passengerRepository.findById(1)).thenReturn(Optional.of(passenger));

        Passenger result = passengerService.getPassengerById(1);
        assertNotNull(result);
        assertEquals("John Doe", result.getName());
    }




	@Test
	void contextLoads() {
	}

}
