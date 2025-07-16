SUMMARY = "Install uEnv.txt to the boot partition"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
SRC_URI = "file://uEnv.txt"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    install -d ${D}/boot
    install -m 0644 ${S}/uEnv.txt ${D}/boot/uEnv.txt
}

FILES:${PN} += "/boot/uEnv.txt"
IMAGE_BOOT_FILES += "uEnv.txt"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  uEnv.txt created by RAMISETTY RANGANADH    *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build