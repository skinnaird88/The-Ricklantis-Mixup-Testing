package plots;

import characters.Person;
import characters.mortys.Morty;
import characters.mortys.Role;
import characters.ricks.Job;
import characters.ricks.Rick;
import org.junit.Before;
import org.junit.Test;
import props.IProp;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TheCampaignTest {

    TheCampaign theCampaign;

    Morty campaignManagerMorty;
    Morty candidateMorty;
    Rick countingRick;
    Rick retiredGeneralRick;
    Rick jugglingRick;
    Rick reverseRickOutrage;
    Rick rickGuiltRick;
    Rick investigatorRick;
    ArrayList<Person> debateCandidates;
    ArrayList<Person> debateRicks;


    @Before
    public void before(){
        theCampaign = new TheCampaign("The Campaign", debateCandidates);
        campaignManagerMorty = new Morty("Campaign Manager Morty", 50, Role.CAMPAIGN_MANAGER);
        candidateMorty = new Morty("Candidate Morty", 100, Role.CANDIDATE);
        countingRick = new Rick("Counting Rick", 300, Job.CANDIDATE, null);
        retiredGeneralRick = new Rick("Retired General Rick", 200, Job.CANDIDATE, null);
        jugglingRick = new Rick("Juggling Rick", 150, Job.CANDIDATE, null);
        reverseRickOutrage = new Rick("Reverse Rick Outrage", 180, Job.CANDIDATE, null);
        rickGuiltRick = new Rick("Rick Guilt Rick", 200, Job.CANDIDATE, null);
        investigatorRick = new Rick("Investigator Rick", 100, Job.INVESTIGATOR, null);
        debateCandidates = new ArrayList<Person>();
        debateRicks = new ArrayList<Person>();
        debateRicks.add(countingRick);
        debateRicks.add(countingRick);
        debateRicks.add(retiredGeneralRick);
        debateRicks.add(jugglingRick);
        debateRicks.add(rickGuiltRick);
        debateCandidates.addAll(debateRicks);
        debateCandidates.add(candidateMorty);
    }
    @Test
    public void allCandidatesAddedToDebate(){
        assertEquals(6, debateCandidates.size());
    }
    @Test
    public void candidateMortyWinsDebate(){
        assertEquals(candidateMorty, theCampaign.debate(debateCandidates, candidateMorty));
    }
}
