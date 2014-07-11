
do_install_append () {
	cd ${D}/lib/firmware/brcm
	ln -sf brcmfmac4329.bin brcmfmac4329-sdio.bin
	ln -sf brcmfmac4330.bin brcmfmac4330-sdio.bin
}

FILES_${PN}-bcm4329 += " \
  /lib/firmware/brcm/brcmfmac4329-sdio.bin \
"

FILES_${PN}-bcm4330 += " \
  /lib/firmware/brcm/brcmfmac4330-sdio.bin \
"

