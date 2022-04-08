package com.wsc.dao;

import com.wsc.dto.DormRegulationDTO;

import java.util.ArrayList;

public class DormRegulationDAO
{
    private FakeDBDormRegulation fakeData;
    private ArrayList<FakeDBDormRegulation> fakeDataSet;

    public DormRegulationDAO()
    {
        fakeData = new FakeDBDormRegulation();
        fakeDataSet = fakeData.dataSet;

    }

    public ArrayList<DormRegulationDTO> getDormRegulations()
    {
        ArrayList<DormRegulationDTO> dormRegulationDTOS = new ArrayList<DormRegulationDTO>();

        for(int i = 0; i < fakeDataSet.size(); i++)
        {
                FakeDBDormRegulation dr = fakeDataSet.get(i);
                dormRegulationDTOS.add(new DormRegulationDTO(dr.regTitle, dr.regDesc));
        }

        return dormRegulationDTOS;
    }

    class FakeDBDormRegulation
    {
        private String regTitle;
        private String regDesc;


        private ArrayList<FakeDBDormRegulation> dataSet;

        public FakeDBDormRegulation()
        {
            generateFakeData();
        }

        public FakeDBDormRegulation(String regTitle, String regDesc)
        {
            this.regTitle = regTitle;
            this.regDesc = regDesc;
        }

        public void generateFakeData()
        {
            dataSet = new ArrayList<FakeDBDormRegulation>();

            dataSet.add(new FakeDBDormRegulation("Alcohol", "Alcohol is not permitted on Wayne State College property. Unlawful or unauthorized possession, use, distribution, dispensing, delivery, sale or consumption, manufacture, or being in the presence of any alcoholic beverage, including empty bottles/cans or any alcohol container on any part of College property including outdoor areas and parking lots is prohibited. Alcohol consumption that endangers the health, safety, or property of oneself or another, or requires medical treatment or College staff intervention is also prohibited. This policy is also outlined in the Student Handbook under Code of conduct (pages 22-23) and is consistent with Board Policy."));
            dataSet.add(new FakeDBDormRegulation("Bathrooms","Students are expected to assist in keeping the bathrooms reasonably clean. Lavatories are not to be used for laundry or dishwashing purposes. Towels and washcloths and other toiletry items are to be kept in rooms. Custodians clean bathrooms on a daily schedule Monday through Friday."));
            dataSet.add(new FakeDBDormRegulation("Bottles and Cans","Empty bottle and can collections other than those in designated recycling containers are not permitted. They present a general health and roach-pest hazard. Retaining empty alcohol containers is a violation of the student conduct alcohol policy."));
            dataSet.add(new FakeDBDormRegulation("Bunk Beds","Student construction of bunked beds is prohibited in all residence halls. All residence hall beds have the capability to be bunked."));
            dataSet.add(new FakeDBDormRegulation("Carpet and Drapes","The State Fire regulations require that all carpet, drapes, or curtains shall be fire rated or of a fire-resistant material. Carpeting that does not meet this requirement shall not exceed 10% of the room floor space."));
            dataSet.add(new FakeDBDormRegulation("Common Area Damages","Prorated charges may be assigned to residents for damage to hall common areas such as hallways, stairwells, bathrooms, lounges, etc. Every effort will be made to identify specific individuals and groups responsible for common area damages. When specific individuals are not identified, the cost of repair or replacement may be divided equally among the floor or hall residents. Charges will be added to student accounts."));
            dataSet.add(new FakeDBDormRegulation("Cooking Appliances","Coffee makers, popcorn poppers and small microwaves (1000 watt power consumption or smaller) are permitted. All other cooking appliances (toasters, roasters, ovens, frying pans, etc.) are prohibited. Students are encouraged to share appliance use with roommates and to use cooking appliances in the hall kitchen. Electrical alterations or room construction is not allowed in any residence hall room."));
            dataSet.add(new FakeDBDormRegulation("Cooking and Food Storage","Students may not cook in their rooms because of the potential fire hazard. All cooking must be done in a hall kitchen. The only exceptions allowed are coffee makers, popcorn poppers, and small microwave ovens. One refrigerator per room is allowed as long as the refrigerator is UL approved and does not exceed 5.0 cubic feet in size. \n\n Each residence hall, except Bowen, has a kitchen facility which may be used to prepare snacks and meals. Each student who uses a kitchen facility shares in the responsibility of washing dishes, utensils, and keeping the counters, floor, stove, sink, and refrigerator clean. Problems of shared cleaning responsibility may result in the temporary closing of kitchen areas. \n\n Any food kept in residence hall rooms must be stored in appropriate, tightly-closed containers. All food should be removed from the room during official vacation periods such as semester and Spring Break. Refrigerators should be cleaned and unplugged before leaving for these vacations."));
            dataSet.add(new FakeDBDormRegulation("Damages","Students assigned to a room are financially responsible for keeping the room, its furnishings and contents free from damage caused by themselves or others. The cost of any damage or extra custodial service, repainting, or carpentry costs will be charged to the occupants of the room. Students are reminded to check the room carefully and fill out the room inventory sheet, distributed by the Resident Assistants at the beginning of the term. \n\n Nails are not to be used on painted walls, doors, or other surfaces. Tapes and adhesives may be used if they are removed before checking out. Students should not use grey duct tape because of the extensive damage that it causes. Residents will be charged for any damage that results."));
            dataSet.add(new FakeDBDormRegulation("False Reporting / Tampering with Emergency Equipment","Turning in a false fire alarm by pulling an alarm box or through a telephone call, or tampering with alarm equipment, misuse of a fire extinguisher and tampering with an AED (Automated External Defibrillator) can be considered a state and local law violation as well as a disregard for the safety and rights of others. Misuse of emergency equipment is considered a serious vioulation and will result in disciplinary action including possible suspension from Wayne State College as well as civil action."));
            dataSet.add(new FakeDBDormRegulation("Fire Alarms / Emergency Evacuation","Fire alarms are installed in all residence halls for the protection of the residents. They should be used ONLY in emergencies. Residents are responsible for learning proper escape routes and for cooperating in orderly evacuations when necessary. When a fire alarm goes off, quickly close windows, wear shoes, carry a towel or article of clothing to cover mouth and leave room with door CLOSED and UNLOCKED. Stay low to the floor in corridors, crawling if necessary to avoid danger of smoke inhalation. All occupants MUST immediately evacuate the hall. Hall staff will check the building to ensure that everyone leaves the hall. Students may not reenter the hall until police or the fire department has checked the building and official permission to reenter has been granted. Regular fire drills are required by state law and will be carried out each semester."));
            dataSet.add(new FakeDBDormRegulation("Fire Escapes","Fire escapes are for emergency use only. They are not to be used as regular exits, lounging, or moving between floors. Violations will result in disciplinary action."));
            dataSet.add(new FakeDBDormRegulation("Fire Extinguishers","There are water pressure fire extinguishers located on every floor of each residence hall on campus. There are powder extinguishers in laundry room and kitchen areas. Extinguishers are to be used only in case of a fire emergency. A WATER EXTINGUISHER SHOULD NEVER BE USED TO EXTINGUISH A FIRE ORIGINATING FROM AN ELECTRICAL OUTLET OR ELECTRICAL BREAKER BOX. A staff member should be notified if it has been necessary to use an extinguisher, regardless of the cause. UNNECESSARY USE OR MISUSE OF A FIRE EXTINGUISHER WILL RESULT IN DISCIPLINARY ACTION."));
            dataSet.add(new FakeDBDormRegulation("Firearms, Fireworks, Explosives, Candles, Incense, and Other Flammable Items","The possession or storage of firearms, ammunition, archery equipment, fireworks, or explosives of any kind in residence halls is prohibited. If it is necessary to bring such items with you to Wayne State, make arrangements with off-campus friends to keep these items for you.\n\nCandles, incense or other flammable materials may not be burned in student rooms or public areas within a residence hall except for use in a group ceremony that has been approved by the Residence Hall staff."));
            dataSet.add(new FakeDBDormRegulation("Keys","Each student will be issued a room key when checking into the residence hall. The replacement cost for a room key is $42.50. The replacement will include the repining of the door lock and the issuance of new room keys. After a lock is repined, the original key will not open the door. Duplication of any college key is prohibited by state law. Students locked out of their room may ask a staff member to unlock the door."));
            dataSet.add(new FakeDBDormRegulation("Front Door Entry with ID Card","Front door keys have been replaced with electronic access using the resident students' ID cards. Students residing in on-campus housing will use their ID cards to grant them access into their assigned residence hall as well as other halls on campus during limited times. \n\n 8 a.m. to 8 p.m.: Any on-campus residential student with an active on-campus housing assignment can gain entry to any residence hall using their ID card. \n\n 8 p.m. to 8 a.m.: Students will only be able to access the residence hall they are assigned to.\n\nWeekends: 24/7 access only to the residence hall students are assigned to.\n\nBreak periods when the halls are closed: All halls will have access restricted 24/7. Students approved to remain on campus over break will be granted temporary access for the days they need to remain on campus."));
            dataSet.add(new FakeDBDormRegulation("Lofts","Student construction or purchase of loft beds is prohibited in all residence halls. See Section VII: Services and Amenities for information on available loft options."));
            dataSet.add(new FakeDBDormRegulation("Personal Property","All personal property must be stored in the student's room and may not be left in hallways, bathrooms, kitchens, or other common areas. The college does not assume responsibility for lost, stolen, or damaged articles. Students are urged to mark all personal items with permanent identification, to avoid leaving valuables and large sums of money in unlocked rooms, and to lock rooms during any absence. All losses should be reported immediately to residence hall staff who will report the loss to a member of Campus Security. Any problems with door locks should be reported immediately."));
            dataSet.add(new FakeDBDormRegulation("Pets","For reasons of health, sanitation, and state law, pets are not permitted in student rooms, lounges, or lobbies. Fish contained in fishbowls or aquariums no larger than 10 gallons, not requiring mechanized air-water recirculation system (i.e., aquarium), are allowed in residence hall rooms. Because damage to an aquarium can cause extensive damage to campus and student property, only one 10-gallon water-filled aquarium per room is permitted."));
        }
    }
}
