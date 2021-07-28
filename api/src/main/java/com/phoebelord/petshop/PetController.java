package com.phoebelord.petshop;

import com.phoebelord.petshop.generated.api.PetApi;
import com.phoebelord.petshop.generated.model.Pet;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
@Validated
public class PetController implements PetApi {

  @Override
  public ResponseEntity<Pet> addPet(Pet pet) throws Exception {
    // TODO Auto-generated method stub
    return PetApi.super.addPet(pet);
  }

  @Override
  public ResponseEntity<Void> deletePet(Long petId) throws Exception {
    // TODO Auto-generated method stub
    return PetApi.super.deletePet(petId);
  }

  @Override
  public ResponseEntity<Pet> getPetById(Long petId) throws Exception {
    // TODO Auto-generated method stub
    return PetApi.super.getPetById(petId);
  }

  @Override
  public ResponseEntity<Pet> updatePet(Pet pet) throws Exception {
    // TODO Auto-generated method stub
    return PetApi.super.updatePet(pet);
  }

}
