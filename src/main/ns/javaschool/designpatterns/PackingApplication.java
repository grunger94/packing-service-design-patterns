package ns.javaschool.designpatterns;

import ns.javaschool.designpatterns.packing.content.PackageContent;
import ns.javaschool.designpatterns.packing.size.PackageSizeEnum;
import ns.javaschool.designpatterns.packing.type.PackageTypeEnum;
import ns.javaschool.designpatterns.shipment.ShipmentModeEnum;
import ns.javaschool.designpatterns.shipment.DeliveryTimeEnum;

public class PackingApplication {

    public static void main(String[] args) {
        sendPackageOne();
        sendPackageTwo();
        sendPackageThree();
        sendPackageFour();
    }

    private static void sendPackageOne() {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSenderName("Victor Anchondo").setSenderAddress("Cuauhtemoc, Chih")
                .setReceiverName("Fer Calderon").setReceiverAddress("Meoqui, Chih");

        PackageContent packageContent = new PackageContent("Glass trophy to the java dev of the year", true, false, false);
        PackageService pack = new PackageService(mailInfo, packageContent);
        pack.shipAndPrintTicket(PackageTypeEnum.BOX, PackageSizeEnum.SMALL, ShipmentModeEnum.LAND, DeliveryTimeEnum.REGULAR);
    }

    private static void sendPackageTwo() {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSenderName("Carlos Marin").setSenderAddress("Cd. Juarez, Chih")
                .setReceiverName("Crys Castillo").setReceiverAddress("Chihuahua, Chih");

        PackageContent packageContent = new PackageContent("12-bottle box of rum", true, true, false);
        PackageService pack = new PackageService(mailInfo, packageContent);
        pack.shipAndPrintTicket(PackageTypeEnum.BOX, PackageSizeEnum.MEDIUM, ShipmentModeEnum.AIR, DeliveryTimeEnum.REGULAR);
    }

    private static void sendPackageThree() {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSenderName("Juan Melo").setSenderAddress("Cuauhtemoc, Chih")
                .setReceiverName("Fer Martinez").setReceiverAddress("Chihuahua, Chih");

        PackageContent packageContent = new PackageContent("Javaschool member card", false, false, false);
        PackageService pack = new PackageService(mailInfo, packageContent);
        pack.shipAndPrintTicket(PackageTypeEnum.ENVELOPE, PackageSizeEnum.SMALL, ShipmentModeEnum.LAND, DeliveryTimeEnum.EXPRESS);
    }

    private static void sendPackageFour() {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSenderName("Pau Quezada").setSenderAddress("Casas grandes, Chih")
                .setReceiverName("Rafa Manrique").setReceiverAddress("Colima, Col");

        PackageContent packageContent = new PackageContent("Anthrax", false, false, true);
        PackageService pack = new PackageService(mailInfo, packageContent);
        pack.shipAndPrintTicket(PackageTypeEnum.ENVELOPE, PackageSizeEnum.MEDIUM, ShipmentModeEnum.AIR, DeliveryTimeEnum.EXPRESS);
    }
}