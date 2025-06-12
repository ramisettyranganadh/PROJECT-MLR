# PROJECT-MLR
1. git clone https://github.com/ramisettyranganadh/PROJECT-YOC.git;
2. git clone https://github.com/ramisettyranganadh/PROJECT-MLR.git;
3. cd PROJECT-YOC; source oe-init-build-env;
4. bitbake-layers add-layer ../../PROJECT-MLR;
5. IMAGE_INSTALL += "dataloader"
6. bitbake core-image-base -c clean; bitbake core-image-base;
