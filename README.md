# PROJECT-MLR

1. git clone https://github.com/ramisettyranganadh/PROJECT-YOC.git -b styhead;
2. git clone https://github.com/ramisettyranganadh/PROJECT-MLR.git meta-mylayer;
3. cd PROJECT-YOC; source oe-init-build-env;
4. bitbake-layers add-layer ../meta-mylayer;
5. IMAGE_INSTALL += "dataloader"
6. IMAGE_INSTALL += "application"
7. IMAGE_INSTALL:append = " uenvtxt"
8. bitbake core-image-sato -c cleanall; bitbake core-image-sato;

-------------------------------------------------------------------

Stuck in GNU Bash ? then add init manager in Yocto

UsrMerge BusyBox:
VIRTUAL-RUNTIME_init_manager = "busybox"
(OR)
UsrMerge SysVinit:
VIRTUAL-RUNTIME_init_manager = "sysvinit"
(OR)
UsrMerge Systemd and remove SysVinit:
DISTRO_FEATURES:append = " usrmerge"
DISTRO_FEATURES:append = " systemd"
VIRTUAL-RUNTIME_init_manager = "systemd"
VIRTUAL-RUNTIME_initscripts = ""

-------------------------------------------------------------------

1. sudo apparmor_parser -R /etc/apparmor.d/unprivileged_userns;
2. lsblk; sudo umount /dev/sda1; sudo mkfs.vfat -F 32 /dev/sda;
3. cd tmp/deploy/images/beaglebone-yocto/
4. sudo dd if=core-image-sato-beaglebone-yocto.rootfs.wic of=/dev/sda status=progress bs=4M
5. sudo minicom -b 115200 -o -D /dev/ttyACM0

