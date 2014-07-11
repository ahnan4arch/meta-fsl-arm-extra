DESCRIPTION = "Nvram support for Broadcom BCM4329 wifi/bt device"
SECTION = "kernel"

include broadcom-nvram-config.inc

SRC_URI += " \
   file://brcmfmac4329-sdio.txt \
"

do_install() {
    install -d  ${D}/lib/firmware/brcm

    cp -r ${WORKDIR}/brcmfmac4329-sdio.txt \
        ${D}/lib/firmware/brcm/
}

FILES_${PN} = " \
  /lib/firmware/brcm/brcmfmac4329-sdio.txt \
"

RDEPENDS_${PN} = " \ 
  linux-firmware-bcm4329 \
"

# For backwards compatibility after rename
RPROVIDES_${PN} = "broadcom-nvram-config"
RREPLACES_${PN} = "broadcom-nvram-config"
RCONFLICTS_${PN} = "broadcom-nvram-config"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(wandboard-dual|wandboard-quad)"
