SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

TEST ?= "bar1"
TEST ?= "bar2"
TEST ??= "bar3"
TEST ??= "bar4"
TEST = "bar5"
TEST ??= "bar6"
TEST ??= "bar7"
TEST ??= "bar8"
TEST ??= "bar9"


python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build
