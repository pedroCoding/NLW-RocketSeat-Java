package com.rocketseat.planner.participant;

import java.util.UUID;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {

    public void registerParticipantsToEvent(List<String> participantsToInvite, UUID tripId){
        
    }

    public void triggerConfirmationEmailToParticipanst(UUID tripId){

    }

    public void registerParticipantsToEvent(java.util.List<String> emails_to_invite, UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerParticipantsToEvent'");
    }
    
}
