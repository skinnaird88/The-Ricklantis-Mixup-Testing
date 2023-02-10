package plots;

import characters.Person;
import characters.mortys.Morty;
import characters.mortys.Role;
import characters.ricks.Job;
import characters.ricks.Rick;
import org.junit.Before;
import org.junit.Test;
import props.IProp;
import props.Weapon;
import props.WeaponType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
    Rick securityRick;
    ArrayList<IProp> securityRickProps;
    ArrayList<Person> debateCandidates;
    ArrayList<Person> debateRicks;
    Weapon laserGun1;
    Weapon laserGun2;


    @Before
    public void before(){
        theCampaign = new TheCampaign("The Campaign", debateCandidates);
        candidateMorty = new Morty("Candidate Morty", 100, Role.CANDIDATE);
        countingRick = new Rick("Counting Rick", 300, Job.CANDIDATE, null);
        retiredGeneralRick = new Rick("Retired General Rick", 200, Job.CANDIDATE, null);
        jugglingRick = new Rick("Juggling Rick", 150, Job.CANDIDATE, null);
        reverseRickOutrage = new Rick("Reverse Rick Outrage", 180, Job.CANDIDATE, null);
        rickGuiltRick = new Rick("Rick Guilt Rick", 200, Job.CANDIDATE, null);
        investigatorRick = new Rick("Investigator Rick", 100, Job.INVESTIGATOR, null);
        laserGun1 = new Weapon(WeaponType.LASER_GUN);
        laserGun2 = new Weapon(WeaponType.LASER_GUN);
        campaignManagerMorty = new Morty("Campaign Manager Morty", 50, Role.CAMPAIGN_MANAGER, laserGun2);
        debateCandidates = new ArrayList<Person>();
        debateRicks = new ArrayList<Person>();
        debateRicks.add(countingRick);
        debateRicks.add(countingRick);
        debateRicks.add(retiredGeneralRick);
        debateRicks.add(jugglingRick);
        debateRicks.add(rickGuiltRick);
        debateCandidates.addAll(debateRicks);
        debateCandidates.add(candidateMorty);
        securityRickProps = new ArrayList<IProp>();
        securityRickProps.add(laserGun1);
        securityRick = new Rick("Security Rick", 450, Job.CIA, securityRickProps);
    }
    @Test
    public void allCandidatesAddedToDebate(){
        assertEquals(6, debateCandidates.size());
    }
    @Test
    public void candidateMortyWinsDebate(){
        assertEquals(candidateMorty, theCampaign.debate(debateCandidates, candidateMorty));
    }
    @Test
    public void campaignManagerAttacksCandidateMorty(){
        assertEquals(1, securityRick.getProps().size());
        assertNotNull(campaignManagerMorty.getProp());
        theCampaign.campaignManagerMortyAttacksCandidateMorty(campaignManagerMorty, candidateMorty, securityRick, laserGun1);
        assertEquals(50, candidateMorty.getHealthValue());
    }
}
