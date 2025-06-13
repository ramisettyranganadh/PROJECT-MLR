SUMMARY = "Graphical User Application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
SRC_URI = "git://github.com/ramisettyranganadh/PROJECT-MLR.git;protocol=https;branch=main"
SRCREV = "d21ea783c283a0380ca12e70a7af5fd220a485b8"

S = "${WORKDIR}/git"
UNPACKDIR = "${S}"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/git/recipes-custom/application/files/application.c -o application
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/application ${D}${bindir}/
}

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Graphical User Interface by RANGANADH      *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build
