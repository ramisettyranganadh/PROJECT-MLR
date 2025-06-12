# PROJECT-MLR

1. git clone https://github.com/ramisettyranganadh/PROJECT-YOC.git;
2. git clone https://github.com/ramisettyranganadh/PROJECT-MLR.git;
3. cd PROJECT-YOC; source oe-init-build-env;
4. bitbake-layers add-layer ../../PROJECT-MLR;
5. IMAGE_INSTALL += "dataloader"
6. IMAGE_INSTALL += "application"
7. bitbake core-image-base -c clean; bitbake core-image-base;

-------------------------------------------------------------------

1. sudo apparmor_parser -R /etc/apparmor.d/unprivileged_userns;
2. lsblk; sudo umount /dev/mmcblk0; sudo mkfs.vfat -F 32 /dev/mmcblk0;
3. cd tmp/deploy/images/beaglebone-yocto/
4. sudo dd if=core-image-base-beaglebone-yocto.rootfs.wic of=/dev/mmcblk0 status=progress bs=4M
5. sudo minicom -b 115200 -o -D /dev/ttyACM0

