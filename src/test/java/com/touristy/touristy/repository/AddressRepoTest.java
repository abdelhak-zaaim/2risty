package com.touristy.touristy.repository;

import com.touristy.touristy.model.entity.Address;
import com.touristy.touristy.service.AddressService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AddressRepoTest {
   @Autowired
   private AddressService addressService;

   @MockBean
   private  AddressRepository addressRepository ;

   @Test
   public void testFindUserByUsername() {
      // Define a sample user
      Address address = new Address();
      address.setId("1");
      address.setCity("john_doe");
      address.setStreet("john@example.com");

      // Mock the repository behavior
      when(addressRepository.findById("1")).thenReturn(Optional.of(address));

      // Perform the test
      Optional<Address> foundAddr = addressService.findAddressById("1");

      // Assertions
      assertThat(foundAddr).isNotNull();
      assertThat(foundAddr.get().getCity()).isEqualTo("john_doe");
      assertThat(foundAddr.get().getStreet()).isEqualTo("john@example.com");
   }

}
